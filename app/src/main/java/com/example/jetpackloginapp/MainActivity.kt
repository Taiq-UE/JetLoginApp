package com.example.jetpackloginapp

import com.example.jetpackloginapp.ui.theme.LightSeledin
import com.example.jetpackloginapp.ui.theme.DarkerSeledin
import com.example.jetpackloginapp.ui.theme.DarkSeledin
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.ui.res.painterResource
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.jetpackloginapp.ui.theme.JetpackLoginAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackLoginAppTheme {
                LoginScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Icon(
            painter = painterResource(id = R.drawable.ic_back),
            contentDescription = null,
            modifier = Modifier.size(80.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Welcome Back",
            style = MaterialTheme.typography.headlineSmall,
            color = LightSeledin
        )
        Text(
            text = "Login to your account",
            style = MaterialTheme.typography.bodyMedium,
            color = DarkSeledin
        )
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email address") },
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = DarkerSeledin,
                unfocusedBorderColor = DarkSeledin,
                focusedLabelColor = DarkerSeledin,
                cursorColor = DarkerSeledin
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = DarkerSeledin,
                unfocusedBorderColor = DarkSeledin,
                focusedLabelColor = DarkerSeledin,
                cursorColor = DarkerSeledin
            )
        )
        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = LightSeledin)
        ) {
            Text("Login")
        }
        Spacer(modifier = Modifier.height(8.dp))

        TextButton(onClick = {}) {
            Text("Forgot password?", color = DarkerSeledin)
        }
        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Or sign in with", style = MaterialTheme.typography.bodySmall, color = DarkerSeledin)
        Spacer(modifier = Modifier.height(16.dp))

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(48.dp)
                    .clickable {}
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_fb),
                    contentDescription = "Facebook",
                    tint = Color.Unspecified,
                    modifier = Modifier.size(60.dp)
                )
            }

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(48.dp)
                    .clickable {}
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_google),
                    contentDescription = "Google",
                    tint = Color.Unspecified,
                    modifier = Modifier.size(48.dp)

                )
            }

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(48.dp)
                    .clickable {}
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_x),
                    contentDescription = "X",
                    tint = Color.Unspecified,
                    modifier = Modifier.size(48.dp)
                )
            }
        }

    }
}