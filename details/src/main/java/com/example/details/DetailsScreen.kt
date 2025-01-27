package com.example.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import org.example.project.shared.styleguide.Res
import org.example.project.shared.styleguide.ic_launcher_background
import org.example.project.shared.styleguide.plural_details
import org.example.project.shared.styleguide.styleguide_details
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.pluralStringResource
import org.jetbrains.compose.resources.stringResource

@Composable
fun DetailsScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = stringResource(Res.string.styleguide_details))
        Image(painterResource(Res.drawable.ic_launcher_background), null)

        Text(text = pluralStringResource(Res.plurals.plural_details, 1,1))
        Text(text = pluralStringResource(Res.plurals.plural_details, 2,2))
        Button(onClick = { navController.popBackStack() }) {
            Text("Back")
        }
    }
}
