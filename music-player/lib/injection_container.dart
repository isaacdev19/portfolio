import 'package:get_it/get_it.dart';
import 'package:music_player/data/datasource/artist_remote_data_source.dart';
import 'package:music_player/data/datasource/categories_remote_data_source.dart';
import 'package:music_player/data/datasource/recommendations_remote_data_source.dart';
import 'package:music_player/data/datasource/search_remote_data_source.dart';
import 'package:music_player/data/datasource/track_remote_data_source.dart';
import 'package:spotify/spotify.dart';

import 'config/constants.dart';

final serviceLocator = GetIt.I;

Future<void> init() async {
  //DataSource
  serviceLocator..registerLazySingleton<ArtistRemoteDataSource>(
    () => ArtistRemoteDataSourceImpl(
      spotify: serviceLocator(),
    )
  )

  ..registerLazySingleton<CategoriesRemoteDataSource>(
    () => CategoriesRemoteDataSourceImpl(
      spotify: serviceLocator(),
    )
  )

  ..registerLazySingleton<RecommendationsRemoteDataSource>(
    () => RecommendationsRemoteDataSourceImpl(
      spotify: serviceLocator(),
    )
  )

  ..registerLazySingleton<SearchRemoteDataSource>(
    () => SearchRemoteDataSourceImpl(
      spotify: serviceLocator(),
    )
  )

  ..registerLazySingleton<TrackRemoteDataSource>(
    () => TrackRemoteDataSourceImpl(
      spotify: serviceLocator(),
    )
  );

  //External
  final credentials = SpotifyApiCredentials(Constants.clientId, Constants.clientSecret);
  final spotify = SpotifyApi(credentials);
  serviceLocator.registerLazySingleton<SpotifyApi>(() => spotify);
}
