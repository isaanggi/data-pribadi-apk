package com.isaanggi.datapribadi

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.isaanggi.datapribadi.data.IsiData

@Composable
fun Home() {
    val strukturs = remember {IsiData.strukturList}
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(
            items = strukturs,
            itemContent = {
                StrukturListItem(struktur = it)
            }
        )
    }
}