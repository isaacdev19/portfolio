import 'package:flutter/material.dart';
import 'package:music_player/config/design/card/home_item_card/home_item_card.dart';

abstract class MyCard extends StatelessWidget {
  const MyCard({
    super.key,
    required this.title,
    required this.subtitle,
  });

  final String title;
  final String subtitle;

  const factory MyCard.homeItemCard({
    Key? key,
    required String subtitle,
    required String title,
    required String image,
  }) = HomeItemCard;
}