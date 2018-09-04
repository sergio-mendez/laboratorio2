Se modifico el proyecto de la siguiente forma:

1. En el proyecto mueblesdelosalpes.backend se realizadon los siguientes cambios:
1.1 Se crea la clase MuebleOferta en el paquete dto con el proposito de crear el modelo de datos de las ofertas a agregar
1.2 En el pagquete logica.ejb se crea la clase ServicioOfertaMock creando el constructor y los metodos para agregar y consultar las ofertas.
1.3 En el paquete logica.interfaces se crean las dos clases IServicioOfertaMockLogica y IServicioOfertaMockRemote siguiendo el ejemplo de la clase IServicioCatalogoMockLogica y IServicioCatalogoMockRemote
1.4 En el paquete persistencia.mock se modifica los metodos create y findAll de la clase ServicioPersistenciaMock para lograr realizar el registro y consulta de las ofertas, teniendo en cuenta la realizacion de la instacia de la clase MuebleOferta

2. En el proyecto mueblesdelosalpes.servicios se crea en el paquete service una nueva clase OfertaService implementado los nuevos servicios para la consulta y creacion de las ofertas.
