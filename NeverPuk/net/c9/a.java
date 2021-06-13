package net.c9;

import com.google.common.collect.ImmutableSet;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Set;
import javax.annotation.Nullable;
import net.wl;
import net.c9.b;
import net.c9.d;
import net.c9.n;
import net.c9.t;
import net.c9.x;
import net.yz.m_;

public class a implements x {
   public static final Set S = ImmutableSet.of("minecraft", "realms");
   private final n L;
   private static final boolean R = net.yz.h.M() == net.yz.h.WINDOWS;

   public a(n var1) {
      this.L = var1;
   }

   public InputStream q(m_ var1) throws IOException {
      InputStream var2 = this.j(var1);
      return var2;
   }

   @Nullable
   public InputStream j(m_ var1) throws IOException {
      File var2 = this.L.l(var1);
      return var2.isFile()?new FileInputStream(var2):null;
   }

   @Nullable
   private InputStream B(m_ var1) {
      b.K();
      String var3 = "/assets/" + var1.A() + "/" + var1.v();
      InputStream var4 = wl.E(var3);
      if(var4 != null) {
         return var4;
      } else {
         URL var5 = a.class.getResource(var3);
         return this.t(new File(var5.getFile()), var3)?a.class.getResourceAsStream(var3):null;
      }
   }

   public boolean E(m_ var1) {
      return this.B(var1) != null || this.L.S(var1);
   }

   public Set k() {
      return S;
   }

   @Nullable
   public net.y3.n K(net.y3.c var1, String var2) throws IOException {
      FileInputStream var3 = new FileInputStream(this.L.n());
      return d.x(var1, var3, var2);
   }

   public BufferedImage y() throws IOException {
      return net.n9.y.T(a.class.getResourceAsStream("/" + (new m_("pack.png")).v()));
   }

   public String U() {
      return "Default";
   }

   private boolean t(File var1, String var2) throws IOException {
      b.K();
      String var4 = var1.getPath();
      if(var4.startsWith("file:")) {
         if(R) {
            var4 = var4.replace("\\", "/");
         }

         return var4.endsWith(var2);
      } else {
         return t.D(var1, var2);
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
