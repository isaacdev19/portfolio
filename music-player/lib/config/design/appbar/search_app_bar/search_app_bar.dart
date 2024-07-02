import 'package:flutter/material.dart';
import 'package:music_player/config/design/appbar/my_appbar.dart';

class SearchAppBar extends MyAppBar {
  const SearchAppBar({super.key});

  @override
  Widget build(BuildContext context) {
    return AppBar(
      actions: [
        IconButton(
          onPressed: () {},
          icon: const Icon(Icons.search),
        )
      ],
    );
  }
}
