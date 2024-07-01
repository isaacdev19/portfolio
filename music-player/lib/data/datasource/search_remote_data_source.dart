import 'package:spotify/spotify.dart';

abstract interface class SearchRemoteDataSource {
  Future<BundledPages> searchTrack(String searchQuery);
}

class SearchRemoteDataSourceImpl implements SearchRemoteDataSource {
  const SearchRemoteDataSourceImpl({required this.spotify});

  final SpotifyApi spotify;

  @override
  Future<BundledPages> searchTrack(String searchQuery) async {
    return spotify.search.get(searchQuery, types: [SearchType.track]);
  }
}
