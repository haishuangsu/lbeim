package info.hermiths.chatapp.ui.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import coil3.ImageLoader
import coil3.compose.AsyncImage
import coil3.compose.LocalPlatformContext
import coil3.compose.rememberAsyncImagePainter

import coil3.request.ImageRequest


@Composable
fun NormalDecryptedOrNotImageView(
    key: String, url: String,
    modifier: Modifier,
    imageLoader: ImageLoader
) {
    val ctx = LocalPlatformContext.current
    AsyncImage(
        model = ImageRequest.Builder(ctx).data(url)
            .decoderFactory(
                DecryptedDecoder.Factory(url = url, key = key)
            )
            .build(),
        contentDescription = "Yo",
        contentScale = ContentScale.FillBounds,
        modifier = modifier,
        imageLoader = imageLoader,
    )
}