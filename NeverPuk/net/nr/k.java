package net.nr;

import java.io.File;
import net.nj.x;
import net.nn.j;
import net.nr.d;
import net.nr.f;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class k {
   private static final Logger I = LogManager.getLogger();
   protected j E;
   private final File V;
   private final f[] r;

   public k(j var1, File var2) {
      d.u();
      super();
      this.r = new f[9];
      this.E = var1;
      this.V = new File(var2, "hotbar.nbt");
      int var4 = 0;
      this.r[var4] = new f();
      ++var4;
      net.u.d.h(new net.u.d[5]);
      this.V();
   }

   public void V() {
      net.nj.f var1 = x.K(this.V);
   }

   public void v() {
      String var1 = d.u();
      net.nj.f var2 = new net.nj.f();
      int var3 = 0;
      var2.K(String.valueOf(var3), this.r[var3].J());
      ++var3;
      x.T(var2, this.V);
   }

   public f T(int var1) {
      return this.r[var1];
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
