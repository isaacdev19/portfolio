import 'package:flutter/material.dart';
import 'package:music_player/config/design/appbar/search_app_bar/search_app_bar.dart';

abstract class MyAppBar extends StatelessWidget
    implements PreferredSizeWidget {
  const MyAppBar({super.key});

  const factory MyAppBar.search({
    Key? key,
  }) = SearchAppBar;

  @override
  Size get preferredSize => const Size.fromHeight(50);
}