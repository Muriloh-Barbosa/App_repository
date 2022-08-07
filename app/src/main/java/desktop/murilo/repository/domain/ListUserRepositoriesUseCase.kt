package desktop.murilo.repository.domain

import desktop.murilo.repository.core.UseCase
import desktop.murilo.repository.data.model.Repo
import desktop.murilo.repository.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}