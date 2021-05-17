package com.uca.attentiprecipes.room

import com.uca.attentiprecipes.model.Recipes
import com.uca.attentiprecipes.utils.EntityMapper
import javax.inject.Inject

class RecipeCacheMapper
@Inject
constructor(): EntityMapper<RecipeCacheEntity, Recipes>{

    override fun mapFromEntity(entity: RecipeCacheEntity): Recipes {
        return Recipes(
            id = entity.id,
            name = entity.name,
            link = entity.link,
            image = entity.image,
            content = entity.content
        )
    }

    override fun mapToEntity(domainModel: Recipes): RecipeCacheEntity {
        return RecipeCacheEntity(
            id = domainModel.id,
            name = domainModel.name,
            image = domainModel.image,
            link = domainModel.link,
            content = domainModel.content
        )
    }

    fun mapFromEntityListRecipe(entities: List<RecipeCacheEntity>): List<Recipes>{
        return entities.map{mapFromEntity(it)}
    }
}