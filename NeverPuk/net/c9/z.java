package net.c9;

import java.io.File;
import net.c9.n;
import net.yz.m_;

public class z extends n {
   private final File f;

   public z(File var1) {
      this.f = var1;
   }

   public File l(m_ var1) {
      return new File(this.f, var1.toString().replace(':', '/'));
   }

   public File n() {
      return new File(this.f, "pack.mcmeta");
   }
}
