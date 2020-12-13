package com.tauheedid.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.tauheedid.R
import com.tauheedid.data.model.prayertime.Times

@Composable
fun PrayerTimeCard(
    times: Times,
    modifier: Modifier = Modifier
) {
    Card(
        shape = MaterialTheme.shapes.small,
        modifier = modifier
            .fillMaxWidth()
    ) {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Bottom
            ) {
                Column(modifier = modifier.padding(16.dp)) {
                    Text(
                        text = "Next Prayer",
                        style = MaterialTheme.typography.h6,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = times.imsak,
                        style = MaterialTheme.typography.h4,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = "00:01:30 menuju Ashr",
                        style = MaterialTheme.typography.body1,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                        color = Color.Gray,
                        fontSize = TextUnit.Sp(12)
                    )
                }
                Image(
                    bitmap = imageResource(id = R.drawable.image_mosque),
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .fillMaxWidth(0.5F)
                        .padding(end = 16.dp, top = 16.dp)

                )
            }
            PrayerTimeList(modifier = modifier, times = times)
            PrayerTimeList(modifier = modifier, times = times)
            PrayerTimeList(modifier = modifier, times = times)
            PrayerTimeList(modifier = modifier, times = times)
        }
    }
}

@Composable
fun PrayerTimeList(modifier: Modifier, times: Times) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 16.dp,
                end = 16.dp,
                top = 4.dp,
                bottom = 4.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Next Prayer",
            style = MaterialTheme.typography.body1,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
        Text(
            text = times.imsak,
            style = MaterialTheme.typography.body1,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Composable
@Preview(name = "PrayerTimeCard Preview")
fun PreviewTimeCard() {
    PrayerTimeCard(
        times = Times(
            imsak = "04:07",
            sunrise = "05:29",
            fajr = "04:17",
            dhuhr = "11:49",
            asr = "15:16",
            sunset = "18:09",
            maghrib = "18:19",
            isha = "19:17",
            midnight = "23:13"
        )
    )
}
