import 'package:flutter/material.dart';
import 'package:music_player/config/design/card/card.dart';

class HomeItemCard extends MyCard {
  const HomeItemCard({
    super.key,
    required super.title,
    required super.subtitle,
    required this.image,
  });

  final String image;

  @override
  Widget build(BuildContext context) {
    return SizedBox(
      height: 242,
      width: 190,
      child: Column(
        mainAxisAlignment: MainAxisAlignment.spaceBetween,
        children: [
          Container(
            height: 190,
            width: 190,
            decoration: BoxDecoration(
              image: DecorationImage(image: NetworkImage(image)),
              borderRadius: BorderRadius.circular(4),
            ),
          ),
        ],
      ),
    );
  }
}
