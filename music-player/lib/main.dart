import 'package:flutter/material.dart';
import 'package:spotify/spotify.dart';

void main() async {
  final credentials = SpotifyApiCredentials('clientId', 'clientSecret');
  final spotify = SpotifyApi(credentials);
  final recommendations = await spotify.recommendations.get();
  recommendations.tracks![0].externalUrls!.spotify;
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.deepPurple),
        useMaterial3: true,
      ),
      home: Container(),
    );
  }
}
