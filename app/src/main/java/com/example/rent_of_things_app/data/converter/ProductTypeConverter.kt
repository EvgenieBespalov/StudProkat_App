package com.example.rent_of_things_app.data.converter

import com.example.rent_of_things_app.data.model.ProductTypeModel
import com.example.rent_of_things_app.domain.entity.ProductTypeEntity

class ProductTypeConverter {
    fun convertProductTypeModelInProductTypeEntity(from: List<String>): ProductTypeEntity =
        ProductTypeEntity(
            productName = from
        )
}