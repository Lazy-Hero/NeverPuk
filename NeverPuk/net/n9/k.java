package net.n9;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import net.c9.q;
import net.n9.e;
import org.apache.commons.io.IOUtils;

public class k {
   public final int D;
   public final int g;

   public k(InputStream var1) throws IOException {
      e.d();
      super();
      DataInputStream var3 = new DataInputStream(var1);
      if(Long.compare(var3.readLong(), -8552249625308161526L) != 0) {
         throw new IOException("Bad PNG Signature");
      } else if(var3.readInt() != 13) {
         throw new IOException("Bad length for IHDR chunk!");
      } else if(var3.readInt() != 1229472850) {
         throw new IOException("Bad type for IHDR chunk!");
      } else {
         this.D = var3.readInt();
         this.g = var3.readInt();
         IOUtils.closeQuietly(var3);
      }
   }

   public static k e(q var0) throws IOException {
      k var1 = new k(var0.k());
      IOUtils.closeQuietly(var0);
      return var1;
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
