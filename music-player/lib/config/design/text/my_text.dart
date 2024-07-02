import 'package:flutter/material.dart';

class MyText extends StatelessWidget {

  const MyText({
    super.key,
    required this.text,
    required this.context,
    this.textStyle,
    this.textOverflow,
    this.textAlign,
    this.maxLines,
  });

  factory MyText.title(
      BuildContext context,
      String text, {
        Key? key,
        TextStyle? textStyle,
        TextOverflow? textOverflow,
        TextAlign? textAlign,
        FontWeight? fontWeight,
        Color? textColor,
        double? fontSize,
        double? letterSpacing,
        double? lineHeight,
        int? maxLines,
      }) =>
      MyText(
        context: context,
        key: key,
        text: text,
        textStyle: TextStyle(
          color: textColor ?? Theme.of(context).colorScheme.secondary,
          fontSize: fontSize ?? 24,
          fontWeight: fontWeight ?? FontWeight.bold,
          letterSpacing: letterSpacing,
          height: lineHeight ?? 1,
        ),
        textOverflow: textOverflow,
        textAlign: textAlign,
        maxLines: maxLines,
      );

  factory MyText.headline1(
      BuildContext context,
      String text, {
        Key? key,
        TextStyle? textStyle,
        TextOverflow? textOverflow,
        TextAlign? textAlign,
        FontWeight? fontWeight,
        Color? textColor,
        double? fontSize,
        double? letterSpacing,
        double? lineHeight,
        int? maxLines,
      }) =>
      MyText(
        context: context,
        key: key,
        text: text,
        textStyle: TextStyle(
          color: textColor ?? Theme.of(context).colorScheme.secondary,
          fontSize: fontSize ?? 20,
          fontWeight: fontWeight,
          letterSpacing: letterSpacing,
          height: lineHeight ?? 1,
        ),
        textOverflow: textOverflow,
        textAlign: textAlign,
        maxLines: maxLines,
      );

  factory MyText.headline2(
      BuildContext context,
      String text, {
        Key? key,
        TextStyle? textStyle,
        TextOverflow? textOverflow,
        TextAlign? textAlign,
        FontWeight? fontWeight,
        Color? textColor,
        double? fontSize,
        double? letterSpacing,
        double? lineHeight,
        int? maxLines,
      }) =>
      MyText(
        context: context,
        key: key,
        text: text,
        textStyle: TextStyle(
          color: textColor ?? Theme.of(context).colorScheme.secondary,
          fontSize: fontSize ?? 18,
          fontWeight: fontWeight,
          letterSpacing: letterSpacing,
          height: lineHeight ?? 1,
        ),
        textOverflow: textOverflow,
        textAlign: textAlign,
        maxLines: maxLines,
      );

  factory MyText.headline3(
      BuildContext context,
      String text, {
        Key? key,
        TextStyle? textStyle,
        TextOverflow? textOverflow,
        TextAlign? textAlign,
        FontWeight? fontWeight,
        Color? textColor,
        double? fontSize,
        double? letterSpacing,
        double? lineHeight,
        int? maxLines,
      }) =>
      MyText(
        context: context,
        key: key,
        text: text,
        textStyle: TextStyle(
          color: textColor ?? Theme.of(context).colorScheme.secondary,
          fontSize: fontSize ?? 16,
          fontWeight: fontWeight,
          letterSpacing: letterSpacing,
          height: lineHeight ?? 1,
        ),
        textOverflow: textOverflow ?? TextOverflow.ellipsis,
        textAlign: textAlign,
        maxLines: maxLines,
      );

  factory MyText.bodyLarge(
      BuildContext context,
      String text, {
        Key? key,
        TextStyle? textStyle,
        TextOverflow? textOverflow,
        TextAlign? textAlign,
        FontStyle? fontStyle,
        FontWeight? fontWeight,
        Color? textColor,
        double? fontSize,
        double? letterSpacing,
        double? lineHeight,
        int? maxLines,
      }) =>
      MyText(
        context: context,
        key: key,
        text: text,
        textStyle: TextStyle(
          color: textColor ?? const Color(0xFFA5C0FF),
          fontSize: fontSize ?? 16,
          letterSpacing: letterSpacing,
          height: lineHeight ?? 1.2,
          fontStyle: fontStyle,
          fontWeight: fontWeight,
        ),
        textAlign: textAlign,
        maxLines: maxLines,
      );

  factory MyText.bodyMedium(
      BuildContext context,
      String text, {
        Key? key,
        TextStyle? textStyle,
        TextOverflow? textOverflow,
        TextAlign? textAlign,
        FontStyle? fontStyle,
        FontWeight? fontWeight,
        Color? textColor,
        double? fontSize,
        double? letterSpacing,
        double? lineHeight,
        int? maxLines,
      }) =>
      MyText(
        context: context,
        key: key,
        text: text,
        textStyle: TextStyle(
          color: textColor ?? Theme.of(context).colorScheme.secondary,
          fontSize: fontSize ?? 14,
          letterSpacing: letterSpacing,
          height: lineHeight ?? 1.2,
          fontStyle: fontStyle,
          fontWeight: fontWeight,
        ),
        textAlign: textAlign,
        maxLines: maxLines,
      );

  factory MyText.bodySmall(
      BuildContext context,
      String text, {
        Key? key,
        TextStyle? textStyle,
        TextOverflow? textOverflow,
        TextAlign? textAlign,
        FontStyle? fontStyle,
        FontWeight? fontWeight,
        Color? textColor,
        double? fontSize,
        double? letterSpacing,
        double? lineHeight,
        int? maxLines,
      }) =>
      MyText(
        context: context,
        key: key,
        text: text,
        textStyle: TextStyle(
          color: textColor ?? Theme.of(context).colorScheme.secondary,
          fontSize: fontSize ?? 12,
          letterSpacing: letterSpacing,
          height: lineHeight ?? 1.2,
          fontStyle: fontStyle,
          fontWeight: fontWeight,
        ),
        textAlign: textAlign,
        maxLines: maxLines,
      );

  factory MyText.mini(
      BuildContext context,
      String text, {
        Key? key,
        TextStyle? textStyle,
        TextOverflow? textOverflow,
        TextAlign? textAlign,
        FontStyle? fontStyle,
        Color? textColor,
        double? fontSize,
        double? letterSpacing,
        double? lineHeight,
        int? maxLines,
      }) =>
      MyText(
        context: context,
        key: key,
        text: text,
        textStyle: TextStyle(
          color: textColor ?? const Color(0xFFA5C0FF),
          fontSize: fontSize ?? 10,
          letterSpacing: letterSpacing,
          height: lineHeight ?? 1.2,
          fontStyle: fontStyle,
        ),
        textAlign: textAlign,
        maxLines: maxLines,
      );


  final String text;
  final BuildContext context;
  final TextStyle? textStyle;
  final TextOverflow? textOverflow;
  final TextAlign? textAlign;
  final int? maxLines;

  @override
  Widget build(BuildContext context) {
    return Text(
      text,
      overflow: textOverflow,
      style: textStyle,
      textAlign: textAlign,
      maxLines: maxLines,
    );
  }
}
