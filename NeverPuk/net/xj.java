package net;

import com.google.common.collect.Maps;
import com.google.common.io.Files;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;
import net.xn;
import net.zk;
import net.nv.s;
import net.nv.w;
import net.yv.r;
import net.yz.i;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class xj implements i {
   private static final Logger z = LogManager.getLogger();
   private final File s;
   private final net.nx.f V;
   private final Map b = Maps.newHashMap();
   private String c = "-";
   private s E;
   private final ArrayDeque u = new ArrayDeque();
   private boolean k = false;
   private final net.nv.f J = new net.nv.f() {
      public String Q() {
         return xj.this.c;
      }

      public boolean n(int var1, String var2) {
         boolean var3 = zk.l.D();
         return var1 <= 2;
      }

      public r T() {
         return xj.this.V.w1[0];
      }

      public net.nx.f E() {
         return xj.this.V;
      }

      private static xn a(xn var0) {
         return var0;
      }
   };

   public xj(@Nullable File var1, net.nx.f var2) {
      this.s = var1;
      this.V = var2;
      this.Y();
   }

   @Nullable
   public s S(net.yz.m_ var1) {
      return (s)this.b.get(var1);
   }

   public w t() {
      return this.V.f();
   }

   public int V() {
      return this.V.w1[0].N().C("maxCommandChainLength");
   }

   public Map W() {
      return this.b;
   }

   public void m() {
      String var1 = this.V.w1[0].N().q("gameLoopFunction");
      if(!var1.equals(this.c)) {
         this.c = var1;
         this.E = this.S(new net.yz.m_(var1));
      }

      if(this.E != null) {
         this.W(this.E, this.J);
      }

   }

   public int W(s var1, net.nv.f var2) {
      int var3 = this.V();
      if(!this.k) {
         this.k = true;
         boolean var10000 = false;
         s.g[] var6 = var1.D();
         int var7 = var6.length - 1;

         while(true) {
            this.u.push(new xj.f(this, var2, var6[var7]));
            --var7;
         }
      }

      if(this.u.size() < var3) {
         this.u.addFirst(new xj.f(this, var2, new s.z(var1)));
      }

      return 0;
   }

   public void Y() {
      this.b.clear();
      this.E = null;
      this.c = "-";
      this.s();
   }

   private void s() {
      boolean var1 = zk.l.p();
      if(this.s != null) {
         this.s.mkdirs();
         Iterator var2 = FileUtils.listFiles(this.s, new String[]{"mcfunction"}, true).iterator();
         if(var2.hasNext()) {
            File var3 = (File)var2.next();
            String var4 = FilenameUtils.removeExtension(this.s.toURI().relativize(var3.toURI()).toString());
            String[] var5 = var4.split("/", 2);
            if(var5.length == 2) {
               net.yz.m_ var6 = new net.yz.m_(var5[0], var5[1]);
               this.b.put(var6, s.q(this, Files.readLines(var3, StandardCharsets.UTF_8)));
            }
         }

         if(!this.b.isEmpty()) {
            z.info("Loaded " + this.b.size() + " custom command functions");
         }
      }

   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   public static class f {
      private final xj o;
      private final net.nv.f A;
      private final s.g t;

      public f(xj var1, net.nv.f var2, s.g var3) {
         this.o = var1;
         this.A = var2;
         this.t = var3;
      }

      public void U(ArrayDeque var1, int var2) {
         this.t.Q(this.o, this.A, var1, var2);
      }

      public String toString() {
         return this.t.toString();
      }
   }
}
