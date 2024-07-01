import 'package:spotify/spotify.dart';

abstract interface class ArtistRemoteDataSource {
  Future<Artist> getArtistById(String artistId);
  Future<List<Track>> getArtistTopTracks(String artistId, Market country);
  Future<Pages<Album>> getArtistAlbum(String artistId);
}

class ArtistRemoteDataSourceImpl implements ArtistRemoteDataSource {
  const ArtistRemoteDataSourceImpl({required this.spotify});

  final SpotifyApi spotify;

  @override
  Future<Artist> getArtistById(String artistId) async {
    return await spotify.artists.get(artistId);
  }

  @override
  Future<List<Track>> getArtistTopTracks(String artistId, Market country) async {
    return await spotify.artists.topTracks(artistId, country) as List<Track>;
  }

  @override
  Future<Pages<Album>> getArtistAlbum(String artistId) async {
    return spotify.artists.albums(artistId);
  }
}
