package assignmentone;

/**
 * Class with an album, with a name, release year and artist.
 * 
 */

public class Album {
  private String name;
  private int releaseYear;
  private String artist;

  /**
   * Constructor .
   *
   * @param name        the name.
   * 
   * @param releaseYear the year.
   * 
   * @param artist      the artist.
   * 
   */

  public Album(String name, int releaseYear, String artist) {
    setName(name);
    setYear(releaseYear);
    setArtist(artist);
  }

  /**
   * this method Set's the name of the album.
   *
   * @param name returns the name of the album.
   * 
   */
  public void setName(String name) {
    if (name != null && name.length() >= 4) {
      this.name = name;
    } else {
      this.name = "No name";
    }
  }

  /**
   * this method Set's the release year of the album.
   *
   * @param releaseYear returns the release year of the album.
   * 
   */

  public void setYear(int releaseYear) {
    if (releaseYear >= 1801 && releaseYear <= 2029) {
      this.releaseYear = releaseYear;
    } else {
      this.releaseYear = -1;
    }
  }

  /**
   * Set the artist of the album.
   *
   * @param artist returns the artist of the album.
   * 
   */

  public void setArtist(String artist) {
    if (artist != null && artist.length() >= 4) {
      this.artist = artist;
    } else {
      this.artist = "No artist";
    }
  }

  /**
   * Get the name of the album.
   *
   * @return the name of the album.
   * 
   */

  public String getName() {
    return name;
  }

  /**
   * Get the release year of the album.
   *
   * @return returns the release year of the album.
   * 
   */

  public int getYear() {
    return releaseYear;
  }

  /**
   * Get the artist of the album.
   *
   * @return returns the artist of the album.
   * 
   */

  public String getArtist() {
    return artist;
  }

  /**
   * Main method.
   * 
   */

  public static void main(String[] args) {
    Album album = new Album("Wish You Were Here", 1975, "Pink Floyd");
    System.out.println(album.getName()
        + " was released in " + album.getYear() + " by " + album.getArtist());
  }
}
