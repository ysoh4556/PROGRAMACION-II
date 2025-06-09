class LineaTeleferico:
    def __init__(self, color="", tramo="", nro_cabinas=0):
        self.color = color
        self.tramo = tramo
        self.nro_cabinas = nro_cabinas
        self.nro_empleados = 0
        self.empleados = []  # Lista de empleados [ [nombre, paterno, materno] ]
        self.edades = []     # Lista de edades
        self.sueldos = []    # Lista de sueldos

    # Agregar empleado
    def agregar_empleado(self, nombre, paterno, materno, edad, sueldo):
        self.empleados.append([nombre, paterno, materno])
        self.edades.append(edad)
        self.sueldos.append(sueldo)
        self.nro_empleados += 1

    # b) Eliminar empleados por apellido (paterno o materno)
    def eliminar_por_apellido(self, apellido):
        i = 0
        while i < self.nro_empleados:
            if self.empleados[i][1] == apellido or self.empleados[i][2] == apellido:
                self.empleados.pop(i)
                self.edades.pop(i)
                self.sueldos.pop(i)
                self.nro_empleados -= 1
            else:
                i += 1

    # c) Transferir empleado X a otro objeto
    def transferir_empleado(self, indice, otra_linea):
        if 0 <= indice < self.nro_empleados:
            nombre, paterno, materno = self.empleados[indice]
            edad = self.edades[indice]
            sueldo = self.sueldos[indice]
            otra_linea.agregar_empleado(nombre, paterno, materno, edad, sueldo)
            
            # Eliminar de la línea actual
            self.empleados.pop(indice)
            self.edades.pop(indice)
            self.sueldos.pop(indice)
            self.nro_empleados -= 1

    # d1) Mostrar empleados con la mayor edad
    def mostrar_mayor_edad(self):
        if self.edades:
            max_edad = max(self.edades)
            print("Empleados con mayor edad:")
            for i in range(self.nro_empleados):
                if self.edades[i] == max_edad:
                    emp = self.empleados[i]
                    print(f"{emp[0]} {emp[1]} {emp[2]} - Edad: {self.edades[i]}")

    # d2) Mostrar empleados con el mayor sueldo
    def mostrar_mayor_sueldo(self):
        if self.sueldos:
            max_sueldo = max(self.sueldos)
            print("Empleados con mayor sueldo:")
            for i in range(self.nro_empleados):
                if self.sueldos[i] == max_sueldo:
                    emp = self.empleados[i]
                    print(f"{emp[0]} {emp[1]} {emp[2]} - Sueldo: {self.sueldos[i]}")

# a) Instanciar 2 objetos de diferentes formas

# Forma directa
linea1 = LineaTeleferico("Rojo", "Estación Central, Cementerio, 16 de Julio", 20)
linea2 = LineaTeleferico()  # Constructor vacío
linea2.color = "Azul"
linea2.tramo = "Buenos Aires, Sopocachi"
linea2.nro_cabinas = 15

# Forma por variables
linea1.agregar_empleado("Pedro", "Rojas", "Luna", 35, 2500)
linea1.agregar_empleado("Lucy", "Sosa", "Rios", 43, 3250)
linea1.agregar_empleado("Ana", "Perez", "Rojas", 26, 2700)
linea1.agregar_empleado("Saul", "Arce", "Calle", 29, 2500)

# b) Eliminar empleados con apellido "Rojas"
linea1.eliminar_por_apellido("Rojas")

# c) Transferir el primer empleado restante a la línea 2
linea1.transferir_empleado(0, linea2)

# d1) Mostrar empleados con mayor edad en línea 1 y línea 2
linea1.mostrar_mayor_edad()
linea2.mostrar_mayor_edad()

# d2) Mostrar empleados con mayor sueldo en línea 1 y línea 2
linea1.mostrar_mayor_sueldo()
linea2.mostrar_mayor_sueldo()
