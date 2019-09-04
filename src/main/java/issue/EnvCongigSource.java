package issue;

import org.eclipse.microprofile.config.spi.ConfigSource;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * A configuration source for {@code application.properties}.
 */
public abstract class EnvCongigSource implements ConfigSource {

  static final String APPLICATION_PROPERTIES = System.getenv( "HL.config.file" );

  private Map<String, String> properties = new HashMap<>( );

  public EnvCongigSource() {
    System.out.println( "EnvCongigSource()" );
    final Path path = Paths.get( APPLICATION_PROPERTIES );

    if ( Files.exists( path ) ) {
      try ( InputStream is = Files.newInputStream( path ) ) {
        Properties props = new Properties( );
        props.load( is );
        properties = ( Map<String, String> ) ( Map ) props;
      }
      catch ( IOException e ) {
        System.out.println( "EnvCongigSource NoSuchFileException or FileNotFoundException" );
        throw new IOError( e );
      }
    }
  }

  @Override
  public int getOrdinal() {
    return 900;
  }

  @Override
  public Map<String, String> getProperties() { return properties; }

  @Override
  public String getValue( String propertyName ) { return properties.get( propertyName ); }

  @Override
  public String getName() { return "MemoryConfigSource"; }
}
