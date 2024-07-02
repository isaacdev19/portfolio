import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:music_player/config/design/appbar/my_appbar.dart';
import 'package:music_player/config/design/card/card.dart';
import 'package:music_player/config/design/text/my_text.dart';

class DashboardPage extends StatelessWidget {
  const DashboardPage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: const MyAppBar.search(),
      body: SafeArea(
        minimum: const EdgeInsets.all(20),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            MyText.title(context, 'Recommended for you'),
            Expanded(
              child: ListView.separated(
                scrollDirection: Axis.horizontal,
                itemBuilder: (context, index) => const MyCard.homeItemCard(
                  subtitle: 'Hola',
                  title: 'Hola',
                  image: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRqrIaOoNLKb_PGfc_nS4s3IVBC8x7x9nYOqQ&s',
                ),
                separatorBuilder: (BuildContext context, int index) { return const Divider(); },
                itemCount: 2,
              ),
            ),
          ],
        ),
      ),
    );
  }
}
