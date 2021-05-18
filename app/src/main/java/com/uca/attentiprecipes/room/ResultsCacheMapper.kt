package com.uca.attentiprecipes.room

import com.uca.attentiprecipes.model.ResultsSearch
import com.uca.attentiprecipes.utils.EntityMapper
import javax.inject.Inject

class ResultsCacheMapper
@Inject
constructor(): EntityMapper<ResultsCacheEntity, ResultsSearch>{

    override fun mapFromEntity(entity: ResultsCacheEntity): ResultsSearch {
        return ResultsSearch(
            searchResults = entity.searchResults
        )
    }

    override fun mapToEntity(domainModel: ResultsSearch): ResultsCacheEntity {
        return ResultsCacheEntity(
            searchResults = domainModel.searchResults
        )
    }

    fun mapFromEntityListResults(entities: List<ResultsCacheEntity>): List<ResultsSearch>{
        return entities.map { mapFromEntity(it) }
    }

}