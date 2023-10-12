package assignmentone;

import java.util.ArrayList;

/**
 * Class for generating lists of an albums.
 *
 * @author Earmyas Measho.
 * 
 */

public class AlbumGenerator {
  /**
   * .
   * this method Generates list of albums.
   *
   * @return the method returns list of albums.
   * 
   */

  public Album[] generateAlbums() {
    Album[] albums = new Album[4];
    albums[0] = new Album("Dark Side of the Moon", 1973, "Pink Floyd");
    albums[1] = new Album("Wish You Were Here", 1975, "Pink Floyd");
    albums[2] = new Album("Animals", 1977, "Pink Floyd");
    albums[3] = new Album("The Wall", 1979, "Pink Floyd");
    return albums;
  }

  /**
   * .
   * the Main.
   *
   * @param args command line arguments.
   * 
   */
  public static void main(String[] args) {
    AlbumGenerator generator = new AlbumGenerator();
    Album[] albums = generator.generateAlbums();
    for (Album album : albums) {
      System.out.println(album.getName() + " was released in "
          + album.getYear() + " by " + album.getArtist());
    }
  }

}
