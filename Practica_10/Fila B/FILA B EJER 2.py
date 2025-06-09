class Ministerio:
    def __init__(self, nombre, direccion, nroEmpleados):
        self.nombre = nombre
        self.direccion = direccion
        self.nroEmpleados = nroEmpleados
        self.empleados = [["", "", ""] for _ in range(100)]  # nombre, apellido_paterno, apellido_materno
        self.edades = [0] * 100
        self.sueldos = [0] * 100

    # Método para agregar un empleado
    def agregar_empleado(self, index, nombre, paterno, materno, edad, sueldo):
        self.empleados[index] = [nombre, paterno, materno]
        self.edades[index] = edad
        self.sueldos[index] = sueldo

    # (b) Eliminar empleados con edad X
    def eliminar_por_edad(self, edad_x):
        for i in range(100):
            if self.edades[i] == edad_x:
                self.empleados[i] = ["", "", ""]
                self.edades[i] = 0
                self.sueldos[i] = 0
                print(f"Empleado en posición {i} eliminado por edad {edad_x}")

    # (c) Sobrecargar el operador + para transferir un empleado de otro ministerio
    def __add__(self, otro):
        for i in range(100):
            if otro.empleados[i][0] != "":  # hay un empleado válido
                for j in range(100):
                    if self.empleados[j][0] == "":  # hay espacio vacío
                        self.empleados[j] = otro.empleados[i]
                        self.edades[j] = otro.edades[i]
                        self.sueldos[j] = otro.sueldos[i]
                        self.nroEmpleados += 1
                        otro.empleados[i] = ["", "", ""]
                        otro.edades[i] = 0
                        otro.sueldos[i] = 0
                        otro.nroEmpleados -= 1
                        print(f"Empleado transferido de {otro.nombre} a {self.nombre}")
                        return self
        print("No se pudo transferir empleado.")
        return self

    # d1) Mostrar empleado con menor edad
    def mostrar_menor_edad(self):
        menor = 999
        pos = -1
        for i in range(100):
            if self.edades[i] != 0 and self.edades[i] < menor:
                menor = self.edades[i]
                pos = i
        if pos != -1:
            print("Empleado con menor edad:")
            print("Nombre:", self.empleados[pos][0], self.empleados[pos][1], self.empleados[pos][2])
            print("Edad:", self.edades[pos])
        else:
            print("No hay empleados registrados.")

    # d2) Mostrar empleado con menor sueldo
    def mostrar_menor_sueldo(self):
        menor = 999999
        pos = -1
        for i in range(100):
            if self.sueldos[i] != 0 and self.sueldos[i] < menor:
                menor = self.sueldos[i]
                pos = i
        if pos != -1:
            print("Empleado con menor sueldo:")
            print("Nombre:", self.empleados[pos][0], self.empleados[pos][1], self.empleados[pos][2])
            print("Sueldo:", self.sueldos[pos])
        else:
            print("No hay empleados registrados.")

# a) Instanciar 2 objetos de diferentes formas

# Forma directa
ministerio1 = Ministerio("Rojo", "Estación Central", 4)
ministerio1.agregar_empleado(0, "Pedro", "Rojas", "Luna", 35, 2500)
ministerio1.agregar_empleado(1, "Lucy", "Sosa", "Rios", 43, 3250)
ministerio1.agregar_empleado(2, "Ana", "Perez", "Rojas", 26, 2700)
ministerio1.agregar_empleado(3, "Saul", "Arce", "Calle", 29, 2500)

# Forma por variables
nombre2 = "Verde"
direccion2 = "Estación Aranjuez"
ministerio2 = Ministerio(nombre2, direccion2, 2)
ministerio2.agregar_empleado(0, "Juan", "Flores", "Mamani", 30, 2800)
ministerio2.agregar_empleado(1, "Carmen", "Quispe", "Choque", 31, 2600)


# b)Eliminar empleados con edad 26 
print("\n--- Eliminando empleados con edad 26 del ministerio Rojo ---")
ministerio1.eliminar_por_edad(26)


# c)Transferir empleado de ministerio2 a ministerio1 
print("\n--- Transfiriendo un empleado del ministerio Verde al ministerio Rojo ---")
ministerio1 = ministerio1 + ministerio2


# d)Mostrar menor edad y menor sueldo (punto d)
print("\n--- Empleado con menor edad en ministerio Rojo ---")
ministerio1.mostrar_menor_edad()

print("\n--- Empleado con menor sueldo en ministerio Rojo ---")
ministerio1.mostrar_menor_sueldo()
