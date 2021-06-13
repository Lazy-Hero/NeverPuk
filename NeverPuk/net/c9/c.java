package net.c9;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.awt.image.BufferedImage;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import net.xn;
import net.c9.b;
import net.c9.f;
import net.c9.k;
import net.c9.t;
import net.c9.x;
import net.yz.at;
import net.yz.m_;
import net.z.w0;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class c {
   private static final Logger o = LogManager.getLogger();
   private static final FileFilter V = new FileFilter() {
      public boolean accept(File var1) {
         int[] var2 = b.K();
         if(var1.isFile() && var1.getName().endsWith(".zip")) {
            boolean var5 = true;
         } else {
            boolean var10000 = false;
         }

         if(var1.isDirectory() && (new File(var1, "pack.mcmeta")).isFile()) {
            boolean var7 = true;
         } else {
            boolean var6 = false;
         }

         return false;
      }

      private static xn a(xn var0) {
         return var0;
      }
   };
   private static final Pattern L = Pattern.compile("^[a-fA-F0-9]{40}$");
   private static final m_ A = new m_("textures/misc/unknown_pack.png");
   private final File O;
   public final x N;
   private final File Z;
   public final net.y3.c y;
   private x E;
   private final ReentrantLock v;
   private ListenableFuture f;
   private List q;
   public final List g;

   public c(File var1, File var2, x var3, net.y3.c var4, net.nr.d var5) {
      b.K();
      super();
      this.v = new ReentrantLock();
      this.q = Lists.newArrayList();
      this.g = Lists.newArrayList();
      this.O = var1;
      this.Z = var2;
      this.N = var3;
      this.y = var4;
      this.o();
      this.b();
      Iterator var7 = var5.f.iterator();
      if(var7.hasNext()) {
         String var8 = (String)var7.next();
         Iterator var9 = this.q.iterator();
         if(var9.hasNext()) {
            c.n var10 = (c.n)var9.next();
            if(var10.V().equals(var8)) {
               if(var10.F() == 3 || var5.wc.contains(var10.V())) {
                  this.g.add(var10);
               }

               var7.remove();
               o.warn("Removed selected resource pack {} because it\'s no longer compatible", var10.V());
            }
         }
      }

   }

   public static Map O() {
      HashMap var0 = Maps.newHashMap();
      var0.put("X-Minecraft-Username", net.nn.j.b().L().w());
      var0.put("X-Minecraft-UUID", net.nn.j.b().L().m());
      var0.put("X-Minecraft-Version", "1.12.2");
      return var0;
   }

   private void o() {
      if(this.O.exists()) {
         if(!this.O.isDirectory() && (!this.O.delete() || !this.O.mkdirs())) {
            o.warn("Unable to recreate resourcepack folder, it exists but is not a directory: {}", this.O);
         }
      } else if(!this.O.mkdirs()) {
         o.warn("Unable to create resourcepack folder: {}", this.O);
      }

   }

   private List N() {
      return this.O.isDirectory()?Arrays.asList(this.O.listFiles(V)):Collections.emptyList();
   }

   private x S(File var1) {
      Object var2;
      if(var1.isDirectory()) {
         var2 = new t(var1);
      } else {
         var2 = new f(var1);
      }

      net.y3.p var3 = (net.y3.p)((x)var2).K(this.y, "pack");
      return (x)(var3.h() == 2?new k((x)var2):var2);
   }

   public void b() {
      ArrayList var1 = Lists.newArrayList();

      for(File var3 : this.N()) {
         c.n var4 = new c.n(var3);
         if(this.q.contains(var4)) {
            int var5 = this.q.indexOf(var4);
            if(var5 > -1 && var5 < this.q.size()) {
               var1.add(this.q.get(var5));
            }
         } else {
            var4.J();
            var1.add(var4);
         }
      }

      this.q.removeAll(var1);

      for(c.n var7 : this.q) {
         var7.Q();
      }

      this.q = var1;
   }

   @Nullable
   public c.n C() {
      if(this.E != null) {
         c.n var1 = new c.n(this.E);
         var1.J();
         return var1;
      } else {
         return null;
      }
   }

   public List b() {
      return ImmutableList.copyOf(this.q);
   }

   public List q() {
      return ImmutableList.copyOf(this.g);
   }

   public void x(List var1) {
      this.g.clear();
      this.g.addAll(var1);
   }

   public File h() {
      return this.O;
   }

   public ListenableFuture Q(String var1, String var2) {
      b.K();
      String var4 = DigestUtils.sha1Hex(var1);
      final String var5 = L.matcher(var2).matches()?var2:"";
      final File var6 = new File(this.Z, var4);
      this.v.lock();
      this.K();
      if(var6.exists()) {
         if(this.n(var5, var6)) {
            ListenableFuture var15 = this.T(var6);
            this.v.unlock();
            return var15;
         }

         o.warn("Deleting file {}", var6);
         FileUtils.deleteQuietly(var6);
      }

      this.D();
      final w0 var7 = new w0();
      Map var8 = O();
      final net.nn.j var9 = net.nn.j.b();
      Futures.getUnchecked(var9.d(new Runnable() {
         public void run() {
            var9.s(var7);
         }
      }));
      final SettableFuture var10 = SettableFuture.create();
      this.f = at.K(var6, var1, var8, 52428800, var7, var9.u());
      Futures.addCallback(this.f, new FutureCallback() {
         public void onSuccess(@Nullable Object var1) {
            int[] var2 = b.K();
            if(c.this.n(var5, var6)) {
               c.this.T(var6);
               var10.set((Object)null);
            }

            c.o.warn("Deleting file {}", var6);
            FileUtils.deleteQuietly(var6);
         }

         public void onFailure(Throwable var1) {
            FileUtils.deleteQuietly(var6);
            var10.setException(var1);
         }

         private static xn a(xn var0) {
            return var0;
         }
      });
      ListenableFuture var11 = this.f;
      this.v.unlock();
      if(net.u.d.y() == null) {
         b.t(new int[4]);
      }

      return var11;
   }

   private boolean n(String var1, File var2) {
      String var3 = DigestUtils.sha1Hex(new FileInputStream(var2));
      if(var1.isEmpty()) {
         o.info("Found file {} without verification hash", var2);
         return true;
      } else if(var3.toLowerCase(Locale.ROOT).equals(var1.toLowerCase(Locale.ROOT))) {
         o.info("Found file {} matching requested hash {}", var2, var1);
         return true;
      } else {
         o.warn("File {} had wrong hash (expected {}, found {}).", var2, var1, var3);
         return false;
      }
   }

   private boolean B(File var1) {
      c.n var2 = new c.n(var1);
      var2.J();
      return true;
   }

   private void D() {
      ArrayList var1 = Lists.newArrayList(FileUtils.listFiles(this.Z, TrueFileFilter.TRUE, (IOFileFilter)null));
      Collections.sort(var1, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
      int var2 = 0;

      for(File var10000 : var1) {
         ++var2;
      }

   }

   public ListenableFuture T(File var1) {
      if(!this.B(var1)) {
         return Futures.immediateFailedFuture(new RuntimeException("Invalid resourcepack"));
      } else {
         this.E = new f(var1);
         return net.nn.j.b().m();
      }
   }

   @Nullable
   public x M() {
      return this.E;
   }

   public void K() {
      this.v.lock();
      if(this.f != null) {
         this.f.cancel(true);
      }

      this.f = null;
      if(this.E != null) {
         this.E = null;
         net.nn.j.b().m();
      }

      this.v.unlock();
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   public class n {
      private final x M;
      private net.y3.p B;
      private m_ D;

      private n(File var2) {
         this((x)c.this.S(var2));
      }

      private n(x var2) {
         this.M = var2;
      }

      public void J() throws IOException {
         this.B = (net.y3.p)this.M.K(c.this.y, "pack");
         this.Q();
      }

      public void t(net.n9.e var1) {
         b.K();
         BufferedImage var3 = null;
         if(this.D == null) {
            var3 = this.M.y();
            if(var3 == null) {
               var3 = net.n9.y.T(net.nn.j.b().C().A(c.A).k());
            }
         }

         if(this.D == null) {
            this.D = var1.u("texturepackicon", new net.n9.x(var3));
         }

         var1.E(this.D);
      }

      public void Q() {
         if(this.M instanceof Closeable) {
            IOUtils.closeQuietly((Closeable)this.M);
         }

      }

      public x G() {
         return this.M;
      }

      public String V() {
         return this.M.U();
      }

      public String z() {
         return this.B == null?net.cb.z.RED + "Invalid pack.mcmeta (or missing \'pack\' section)":this.B.H().c();
      }

      public int F() {
         return this.B == null?0:this.B.h();
      }

      public boolean equals(Object var1) {
         return this == var1?true:var1 instanceof c.n && this.toString().equals(var1.toString());
      }

      public int hashCode() {
         return this.toString().hashCode();
      }

      public String toString() {
         return String.format("%s:%s", new Object[]{this.M.U(), this.M instanceof t?"folder":"zip"});
      }

      private static Exception a(Exception var0) {
         return var0;
      }
   }
}
