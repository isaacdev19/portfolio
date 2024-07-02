import 'package:flutter/material.dart';
import 'package:music_player/config/design/theme/dark/dark_app_theme.dart';
import 'package:music_player/injection_container.dart' as injection_container;
import 'package:music_player/presentation/dashboard/dashboard_page.dart';

void main() async {
  WidgetsFlutterBinding.ensureInitialized();
  await injection_container.init();
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: darkAppTheme,
      darkTheme: darkAppTheme,
      debugShowCheckedModeBanner: false,
      home: const DashboardPage(),
    );
  }
}
