package net.c9;

import java.io.File;
import java.io.FileNotFoundException;

public class l extends FileNotFoundException {
   public l(File var1, String var2) {
      super(String.format("\'%s\' in ResourcePack \'%s\'", new Object[]{var2, var1}));
   }
}
