package com.example.rent_of_things_app.data.repository

import com.example.rent_of_things_app.data.api.ProductApi
import com.example.rent_of_things_app.data.converter.ProductConverter
import com.example.rent_of_things_app.domain.entity.ProductEntity
import com.example.rent_of_things_app.domain.repository.ProductRepository

class ProductRepositoryImpl(
    private val productApi: ProductApi,
    private val productConverter: ProductConverter
): ProductRepository {
    override suspend fun getAllProduct(): List<ProductEntity> =
        productApi.getAllProduct().map { productConverter.convertProductModelInEntity(it) }

    override suspend fun getIdProduct(productId: String): ProductEntity =
        productConverter.convertProductModelInEntity(productApi.getIdProduct(productId))

    override suspend fun getProductsByType(productType: String): List<ProductEntity> =
        productApi.getProductsByType(productType).map { productConverter.convertProductModelInEntity(it) }

    override suspend fun getProductByUserId(userId: String): List<ProductEntity> =
        productApi.getProductByUserId(userId).map { productConverter.convertProductModelInEntity(it) }

    override suspend fun createProduct(productData: ProductEntity): ProductEntity =
        productConverter.convertProductAnswerModelInProductEntity(productApi.createProduct(productConverter.convertProductEntityInProductRequestModel(productData)))

}