import 'package:spotify/spotify.dart';

abstract interface class RecommendationsRemoteDataSource {
  Future<Recommendations> getRecommendations();
}

class RecommendationsRemoteDataSourceImpl implements RecommendationsRemoteDataSource {
  const RecommendationsRemoteDataSourceImpl({
    required this.spotify,
  });

  final SpotifyApi spotify;

  @override
  Future<Recommendations> getRecommendations() async {
    return await spotify.recommendations.get();
  }
}
