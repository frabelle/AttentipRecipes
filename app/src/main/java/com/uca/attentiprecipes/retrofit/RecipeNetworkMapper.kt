package com.uca.attentiprecipes.retrofit

import com.uca.attentiprecipes.model.Recipes
import com.uca.attentiprecipes.utils.EntityMapper
import javax.inject.Inject

class RecipeNetworkMapper
@Inject
constructor(): EntityMapper<RecipeNetworkEntity, Recipes> {
    override fun mapFromEntity(entity: RecipeNetworkEntity): Recipes {
        return Recipes(
            id = entity.id,
            name = entity.name,
            image = entity.image,
            link = entity.link,
            content = entity.content
        )
    }

    override fun mapToEntity(domainModel: Recipes): RecipeNetworkEntity {
        return RecipeNetworkEntity(
            id = domainModel.id,
            name = domainModel.name,
            image = domainModel.image,
            link = domainModel.link,
            content = domainModel.content
        )
    }

    fun mapFromEntityListRecipe(entities: List<RecipeNetworkEntity>): List<Recipes>{
        return entities.map{mapFromEntity(it)}
    }

}