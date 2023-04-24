package servicios

import producto.Product

interface UserService {
    fun createProduct(product: Product): Int

    fun getById(id: Int): Product?

    fun createTable()
}
