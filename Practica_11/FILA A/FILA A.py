class Artista:
    def __init__(self, nombre, ci, anios_experiencia):
        self.nombre = nombre
        self.ci = ci
        self.anios_experiencia = anios_experiencia

class Anuncio:
    def __init__(self, numero, precio):
        self.numero = numero
        self.precio = precio

class Obra:
    def __init__(self, titulo, material, artistas, anuncio=None):
        self.titulo = titulo
        self.material = material
        self.artistas = artistas  # lista de objetos Artista
        self.anuncio = anuncio

class Pintura(Obra):
    def __init__(self, titulo, material, artistas, genero, anuncio=None):
        super().__init__(titulo, material, artistas, anuncio)
        self.genero = genero

#a)
# Artistas
art1 = Artista("Lucía", "12345", 5)
art2 = Artista("Mario", "54321", 10)

# Anuncio
anuncio1 = Anuncio(1, 500.0)

# Pinturas
pintura1 = Pintura("Paisaje", "Óleo", [art1], "Paisajismo", anuncio1)
pintura2 = Pintura("Retrato", "Acrílico", [art2], "Retrato")

#b)

def artista_con_mas_experiencia(p1, p2):
    todos_artistas = p1.artistas + p2.artistas
    return max(todos_artistas, key=lambda a: a.anios_experiencia)

experto = artista_con_mas_experiencia(pintura1, pintura2)
print("Artista con más experiencia:", experto.nombre)


#c)

# Agregamos un anuncio a la pintura sin anuncio
pintura2.anuncio = Anuncio(2, 750.0)

def total_ventas(p1, p2):
    total = 0
    for p in [p1, p2]:
        if p.anuncio:
            total += p.anuncio.precio
    return total

print("Total venta de ambas pinturas:", total_ventas(pintura1, pintura2))

