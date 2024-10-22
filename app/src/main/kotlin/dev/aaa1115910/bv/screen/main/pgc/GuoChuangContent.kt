package dev.aaa1115910.bv.screen.main.pgc

import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.aaa1115910.biliapi.repositories.PgcType
import dev.aaa1115910.bv.viewmodel.pgc.PgcGuoChuangViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun GuoChuangContent(
    modifier: Modifier = Modifier,
    lazyListState: LazyListState,
    pgcViewModel: PgcGuoChuangViewModel = koinViewModel()
) {
    PgcScaffold(
        lazyListState = lazyListState,
        pgcViewModel = pgcViewModel,
        pgcType = PgcType.GuoChuang
    )
}