import 'package:spotify/spotify.dart';

abstract interface class CategoriesRemoteDataSource {
  Future<Pages<Category>> getCategories();
  Future<Category> getCategoryById(String categoryId);
}

class CategoriesRemoteDataSourceImpl implements CategoriesRemoteDataSource {
  CategoriesRemoteDataSourceImpl({required this.spotify});

  final SpotifyApi spotify;

  @override
  Future<Pages<Category>> getCategories() async {
    return spotify.categories.list();
  }

  @override
  Future<Category> getCategoryById(String categoryId) async {
    return await spotify.categories.get(categoryId);
  }
}
