import 'package:flutter/material.dart';

const lightColorScheme = ColorScheme(
  brightness: Brightness.light,
  //primary
  primary: primary,
  onPrimary: secondary,
  //secondary
  secondary: secondary,
  onSecondary: primary,
  //error
  error: error,
  onError: secondary,
  //background
  background: primary,
  onBackground: secondary,
  //surface
  surface: primary,
  onSurface: secondary,
);

const primary = Color(0xFFEAF0FF);
const secondary = Color(0xFF091227);
const error = Colors.red;
