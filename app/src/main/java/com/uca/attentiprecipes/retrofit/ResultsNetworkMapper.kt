package com.uca.attentiprecipes.retrofit

import com.uca.attentiprecipes.model.ResultsSearch
import com.uca.attentiprecipes.utils.EntityMapper
import javax.inject.Inject

class ResultsNetworkMapper
@Inject
constructor(): EntityMapper<ResultsNetworkEntity, ResultsSearch>{
    override fun mapFromEntity(entity: ResultsNetworkEntity): ResultsSearch {
        return ResultsSearch(
            searchResults = entity.searchResults
        )
    }

    override fun mapToEntity(domainModel: ResultsSearch): ResultsNetworkEntity {
        return ResultsNetworkEntity(
            searchResults = domainModel.searchResults
        )
    }

    fun mapFromEntityListResults(entities: List<ResultsNetworkEntity>): List<ResultsSearch>{
        return entities.map { mapFromEntity(it) }
    }
}