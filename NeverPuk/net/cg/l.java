package net.cg;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.annotation.Nullable;
import net.cg.d;
import net.cg.e;
import net.cg.o;
import net.nx.f;
import net.yv.c;
import net.yv.ov;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class l implements d, o {
   private static final Logger O = LogManager.getLogger();
   private final File o;
   private final File E;
   private final File G;
   private final long N = f.X();
   private final String w;
   private final net.yj.e n;
   protected final net.c0.d a;

   public l(File var1, String var2, boolean var3, net.c0.d var4) {
      this.a = var4;
      this.o = new File(var1, var2);
      this.o.mkdirs();
      this.E = new File(this.o, "playerdata");
      this.G = new File(this.o, "data");
      this.G.mkdirs();
      this.w = var2;
      this.E.mkdirs();
      this.n = new net.yj.e((new File(this.o, "structures")).toString(), var4);
      this.B();
   }

   private void B() {
      File var1 = new File(this.o, "session.lock");
      DataOutputStream var2 = new DataOutputStream(new FileOutputStream(var1));
      var2.writeLong(this.N);
      var2.close();
   }

   public File G() {
      return this.o;
   }

   public void I() throws ov {
      File var1 = new File(this.o, "session.lock");
      DataInputStream var2 = new DataInputStream(new FileInputStream(var1));
      if(var2.readLong() != this.N) {
         throw new ov("The save is being accessed from another location, aborting");
      } else {
         var2.close();
      }
   }

   public net.ny.j d(c var1) {
      throw new RuntimeException("Old Chunk Storage is no longer supported.");
   }

   @Nullable
   public net.cg.z F() {
      File var1 = new File(this.o, "level.dat");
      if(var1.exists()) {
         net.cg.z var2 = e.Q(var1, this.a);
         return var2;
      } else {
         var1 = new File(this.o, "level.dat_old");
         return var1.exists()?e.Q(var1, this.a):null;
      }
   }

   public void Z(net.cg.z var1, @Nullable net.nj.f var2) {
      net.cg.z.z();
      net.nj.f var4 = var1.M(var2);
      net.nj.f var5 = new net.nj.f();
      var5.K("Data", var4);
      File var6 = new File(this.o, "level.dat_new");
      File var7 = new File(this.o, "level.dat_old");
      File var8 = new File(this.o, "level.dat");
      net.nj.x.z(var5, new FileOutputStream(var6));
      if(var7.exists()) {
         var7.delete();
      }

      var8.renameTo(var7);
      if(var8.exists()) {
         var8.delete();
      }

      var6.renameTo(var8);
      if(var6.exists()) {
         var6.delete();
      }

   }

   public void g(net.cg.z var1) {
      this.Z(var1, (net.nj.f)null);
   }

   public void b(net.r.r var1) {
      net.nj.f var2 = var1.G(new net.nj.f());
      File var3 = new File(this.E, var1.r() + ".dat.tmp");
      File var4 = new File(this.E, var1.r() + ".dat");
      net.nj.x.z(var2, new FileOutputStream(var3));
      if(var4.exists()) {
         var4.delete();
      }

      var3.renameTo(var4);
   }

   @Nullable
   public net.nj.f S(net.r.r var1) {
      net.nj.f var2 = null;
      File var3 = new File(this.E, var1.r() + ".dat");
      if(var3.exists() && var3.isFile()) {
         var2 = net.nj.x.r(new FileInputStream(var3));
      }

      var1.B(this.a.V(net.c0.q.PLAYER, var2));
      return var2;
   }

   public o Y() {
      return this;
   }

   public String[] n() {
      String[] var1 = this.E.list();
      var1 = new String[0];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         if(var1[var2].endsWith(".dat")) {
            var1[var2] = var1[var2].substring(0, var1[var2].length() - 4);
         }
      }

      return var1;
   }

   public void K() {
   }

   public File q(String var1) {
      return new File(this.G, var1 + ".dat");
   }

   public net.yj.e N() {
      return this.n;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
