package net.c9;

import com.google.common.collect.Lists;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.c9.b;
import net.c9.g;
import net.c9.p;
import net.c9.q;
import net.c9.x;
import net.yz.m_;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class pp implements p {
   private static final Logger a = LogManager.getLogger();
   protected final List o = Lists.newArrayList();
   private final net.y3.c V;

   public pp(net.y3.c var1) {
      this.V = var1;
   }

   public void y(x var1) {
      this.o.add(var1);
   }

   public Set o() {
      return Collections.emptySet();
   }

   public q A(m_ var1) throws IOException {
      this.M(var1);
      x var2 = null;
      m_ var3 = M(var1);
      int var4 = this.o.size() - 1;

      while(true) {
         x var5 = (x)this.o.get(var4);
         if(var5.E(var3)) {
            var2 = var5;
         }

         if(var5.E(var1)) {
            InputStream var6 = null;
            var6 = this.o(var3, var2);
            return new g(var5.U(), var1, this.o(var1, var5), var6, this.V);
         }

         --var4;
      }
   }

   protected InputStream o(m_ var1, x var2) throws IOException {
      InputStream var3 = var2.q(var1);
      return (InputStream)(a.isDebugEnabled()?new pp.f(var3, var1, var2.U()):var3);
   }

   private void M(m_ var1) throws IOException {
      if(var1.v().contains("..")) {
         throw new IOException("Invalid relative path to resource: " + var1);
      }
   }

   public List R(m_ var1) throws IOException {
      b.K();
      this.M(var1);
      ArrayList var3 = Lists.newArrayList();
      m_ var4 = M(var1);
      Iterator var5 = this.o.iterator();
      if(var5.hasNext()) {
         x var6 = (x)var5.next();
         if(var6.E(var1)) {
            InputStream var7 = var6.E(var4)?this.o(var4, var6):null;
            var3.add(new g(var6.U(), var1, this.o(var1, var6), var7, this.V));
         }
      }

      if(var3.isEmpty()) {
         throw new FileNotFoundException(var1.toString());
      } else {
         return var3;
      }
   }

   static m_ M(m_ var0) {
      return new m_(var0.A(), var0.v() + ".mcmeta");
   }

   private static IOException a(IOException var0) {
      return var0;
   }

   static class f extends InputStream {
      private final InputStream U;
      private final String Z;
      private boolean g;

      public f(InputStream var1, m_ var2, String var3) {
         this.U = var1;
         ByteArrayOutputStream var4 = new ByteArrayOutputStream();
         (new Exception()).printStackTrace(new PrintStream(var4));
         this.Z = "Leaked resource: \'" + var2 + "\' loaded from pack: \'" + var3 + "\'\n" + var4;
      }

      public void close() throws IOException {
         this.U.close();
         this.g = true;
      }

      protected void finalize() throws Throwable {
         int[] var1 = b.K();
         if(!this.g) {
            pp.a.warn(this.Z);
         }

         super.finalize();
      }

      public int read() throws IOException {
         return this.U.read();
      }

      private static Throwable a(Throwable var0) {
         return var0;
      }
   }
}
