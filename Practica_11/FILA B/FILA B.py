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
art1 = Artista("Juan", "112233", 7)
art2 = Artista("Ana", "445566", 12)
art3 = Artista("Luis", "778899", 9)

# Anuncios
an1 = Anuncio(10, 1000.0)
an2 = Anuncio(11, 1500.0)

# Pinturas
p1 = Pintura("Sol Naciente", "Acuarela", [art1, art2], "Impresionismo", an1)
p2 = Pintura("Lago Azul", "Óleo", [art3], "Paisaje", an2)

#b)
def promedio_experiencia(pinturas):
    artistas = []
    for p in pinturas:
        artistas.extend(p.artistas)
    total_exp = sum(a.anios_experiencia for a in artistas)
    return total_exp / len(artistas)

prom = promedio_experiencia([p1, p2])
print("Promedio de experiencia:", prom)

#c)
def incrementar_precio_por_artista(pinturas, nombre_artista, incremento):
    for p in pinturas:
        for a in p.artistas:
            if a.nombre == nombre_artista and p.anuncio:
                p.anuncio.precio += incremento
                print(f"Nuevo precio de '{p.titulo}' es {p.anuncio.precio}")

incrementar_precio_por_artista([p1, p2], "Luis", 200.0)
