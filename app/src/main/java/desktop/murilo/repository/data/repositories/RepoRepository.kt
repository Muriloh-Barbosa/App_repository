package desktop.murilo.repository.data.repositories

import desktop.murilo.repository.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}