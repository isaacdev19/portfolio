import 'package:spotify/spotify.dart';

abstract interface class TrackRemoteDataSource {
  Future<Track> getTrackById(String trackId);
}

class TrackRemoteDataSourceImpl implements TrackRemoteDataSource {
  const TrackRemoteDataSourceImpl({required this.spotify});

  final SpotifyApi spotify;

  @override
  Future<Track> getTrackById(String trackId) async {
    return await spotify.tracks.get(trackId);
  }
}
