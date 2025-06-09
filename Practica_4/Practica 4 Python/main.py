import math

# Círculo
def area_circulo(radio):
    return math.pi * radio ** 2

# Rectángulo
def area_rectangulo(base, altura):
    return base * altura

# Triángulo rectángulo
def area_triangulo(base, altura):
    return (base * altura) / 2

# Trapecio
def area_trapecio(base_mayor, base_menor, altura):
    return ((base_mayor + base_menor) * altura) / 2

# Pentágono regular
def area_pentagono(lado, apotema):
    return (5 * lado * apotema) / 2


if __name__ == "__main__":
    print("Área del círculo (radio=5):", area_circulo(5))
    print("Área del rectángulo (base=4, altura=6):", area_rectangulo(4, 6))
    print("Área del triángulo (base=3, altura=4):", area_triangulo(3, 4))
    print("Área del trapecio (base_mayor=6, base_menor=4, altura=5):", area_trapecio(6, 4, 5))
    print("Área del pentágono (lado=5, apotema=3):", area_pentagono(5, 3))