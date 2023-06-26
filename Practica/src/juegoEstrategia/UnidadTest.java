package juegoEstrategia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class UnidadTest {
	
////////////////// TESTEO SOLDADO VS TODAS LAS UNIDADES //////////////////
	
		@Test
		public void SoldadoTest() {
			
			Soldado rambo = new Soldado(new Punto(1,1));
			Soldado conan = new Soldado(new Punto(1,1));
			rambo.atacar(conan);
			
			assertEquals(90, rambo.getEnergia());
			assertEquals(190, conan.getSalud(),0);
			
			while(rambo.puedeAtacar(conan)) {
				
				rambo.atacar(conan);
				
			}
			
			assertEquals(100, conan.getSalud(),0);
			assertEquals(0, rambo.getEnergia());
			
			assertTrue(conan.puedeAtacar(rambo));
					
		}
		
		@Test
		public void SoldadoVsArqueroTest() {
			
			Soldado s1 = new Soldado(new Punto(2,3));
			Arquero a1 = new Arquero(new Punto(2,3));
			
			for(int x = 0; x < 11; x++)
					s1.atacar(a1);
			
			assertEquals(0, s1.getEnergia());
			
		}
		
		@Test
		public void SoldadoVsLanceroTest() {
			
			Soldado s1 = new Soldado(new Punto(2,3));
			Lancero l1 = new Lancero(new Punto(1,3));
					
			s1.atacar(l1);
			l1.atacar(s1);
			
			assertEquals(90, s1.getEnergia());
			assertEquals(175, s1.getSalud());
			assertEquals(140, l1.getSalud());
			
		}
		
		@Test
		public void SoldadoVsCaballeroTest() {
			
			Soldado s1 = new Soldado(new Punto(2,3));
			Caballero c1 = new Caballero(new Punto(2,3), new Caballo());	
			
			s1.atacar(c1);
			
			assertEquals(90, s1.getEnergia());
			assertEquals(190, c1.getSalud());
			
		}
		
		@Test
		public void RamboAtacaDosVecesAConanTest() {
			
			Soldado rambo = new Soldado(new Punto(1,1));
			Soldado conan = new Soldado(new Punto(1,1));
			
			rambo.atacar(conan);
			rambo.atacar(conan);
				
			assertEquals(80, rambo.getEnergia());
			assertEquals(180, conan.getSalud(),0);
			
			assertTrue(conan.puedeAtacar(rambo));
					
		}
		
		@Test
		public void SoldadosAtaqueHastaMorirTest() {
			
			Soldado s1 = new Soldado(new Punto(2,2));
			Soldado s2 = new Soldado(new Punto(2,2));
			
			for(int x = 0; x <=9; x++) {
				s1.atacar(s2);
			}
			
			assertEquals(0, s1.getEnergia());
			assertEquals(100, s2.getSalud());
			
			s1.beberAgua();
			
			for(int x = 0; x <=9; x++) {
				s1.atacar(s2);
			}
			
			assertEquals(0, s1.getEnergia());
			assertEquals(0, s2.getSalud());
			
			assertEquals(true, s2.estaMuerta());
		}
		
		@Test
		public void SoldadosSinEnergiaTest() {
			Soldado s1 = new Soldado(new Punto(2,2));
			Soldado s2 = new Soldado(new Punto(2,2));
			
			for(int x = 0; x <=9; x++) {
				s1.atacar(s2);
			}
			
			for(int x = 0; x <=9; x++) {
				s2.atacar(s1);
			}
			
			assertEquals(0, s1.getEnergia());
			assertEquals(0, s2.getEnergia());
			
		}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////		

//////////////////TESTEO ARQUERO VS TODAS LAS UNIDADES //////////////////


	    @Test
		public void ArqueroTest() {
			
			Arquero a1 = new Arquero(new Punto(2,2));
			Arquero a2 = new Arquero(new Punto(2,2));
			
			a1.atacar(a2); 
			a2.atacar(a1); 
			a2.atacar(a1); 
			
			assertEquals(45, a2.getSalud());
			assertEquals(19, a1.getFlechas());
		
			assertEquals(40, a1.getSalud());
			assertEquals(18, a2.getFlechas());
		}
	    
	    @Test
		public void ArqueroVsSoldadoTest() {
			
			Arquero a1 = new Arquero(new Punto(2,2));
			Soldado s1 = new Soldado(new Punto(2,2));
			
			a1.atacar(s1); 
			a1.atacar(s1); 
			s1.atacar(a1); 
			
			assertEquals(190, s1.getSalud());
			assertEquals(90, s1.getEnergia());
			
			assertEquals(40, a1.getSalud());
		    assertEquals(18, a1.getFlechas());
			
			
		}
	    
	    @Test
		public void ArqueroVsLanceroTest() {
			
			Arquero a1 = new Arquero(new Punto(2,2));
			Lancero l1 = new Lancero(new Punto(2,2));
			
			a1.atacar(l1); 
			l1.atacar(a1); 
			l1.atacar(a1); 
			
			assertEquals(145, l1.getSalud());
			assertEquals(19, a1.getFlechas());
			
			assertEquals(0, a1.getSalud());
			
		}
	    
	    @Test
		public void ArqueroVsCaballeroTest() {
			
			Arquero a1 = new Arquero(new Punto(2,2));
			Caballero c1 = new Caballero(new Punto(2,2), new Caballo());
			
			a1.atacar(c1); 
			c1.atacar(a1); 
			
			assertEquals(195, c1.getSalud());
			assertEquals(19, a1.getFlechas());
			
			assertEquals(0, a1.getSalud());
			
		}

		
///////////////////////////////////////////////////////////////////////////////////////////////////////		

//////////////////TESTEO LANCERO VS TODAS LAS UNIDADES //////////////////
		
	@Test
	public void LanceroTest() {
		
		Lancero l1 = new Lancero(new Punto(1,2));
		Lancero l2 = new Lancero(new Punto(1,2));
		
		l2.atacar(l1);
		l2.atacar(l1);
		l1.atacar(l2);
		
		assertEquals(125, l2.getSalud());
	    assertEquals(100, l1.getSalud());
	}
	
	@Test
	public void LanceroVsSoldadoTest() {
		
		Lancero l1 = new Lancero(new Punto(1,1));
		Soldado s1 = new Soldado(new Punto(1,2));
		
		l1.atacar(s1);
		l1.atacar(s1);
		
		assertEquals(150, l1.getSalud());
		assertEquals(150, s1.getSalud());
	}
	
	@Test
	public void LanceroVsArqueroTest() {
		
		Lancero l1 = new Lancero(new Punto(1,1));
		Arquero a1 = new Arquero(new Punto(1,2));
		
		l1.atacar(a1);
		l1.atacar(a1);
		
		assertEquals(150, l1.getSalud());
		assertEquals(0, a1.getSalud());
	}	
	
	@Test
	public void LanceroVsCaballeroTest() {
		
		Lancero l1 = new Lancero(new Punto(1,1));
		Caballero c1 = new Caballero(new Punto(1,2), new Caballo());
		
		l1.atacar(c1);
		l1.atacar(c1);
		
		assertEquals(150, l1.getSalud());
		assertEquals(150, c1.getSalud());
	}	
	
///////////////////////////////////////////////////////////////////////////////////////////////////////		

//////////////////TESTEO CABALLERO VS TODAS LAS UNIDADES //////////////////
	
	@Test
	public void CaballeroTest() {
		Caballero c1 = new Caballero(new Punto(1,1), new Caballo());
		Caballero c2 = new Caballero(new Punto(1,1), null);
		
		c1.atacar(c2);
		
		assertEquals(200, c1.getSalud());
		assertEquals(150, c2.getSalud());
			
	}
	
	@Test
	public void CaballeroVsSoldadoTest() {
		
		Caballero c1 = new Caballero(new Punto(1,1), new Caballo());
		Soldado s1 = new Soldado(new Punto(1,2));
		
		c1.atacar(s1);
		
		assertEquals(200, c1.getSalud());
		assertEquals(150, s1.getSalud());
		
	}
	
	@Test
	public void CaballeroVsArqueroTest() {
		
		Caballero c1 = new Caballero(new Punto(1,1), new Caballo());
		Arquero a1 = new Arquero(new Punto(1,2));
		
		c1.atacar(a1);
		a1.atacar(c1);
		
		assertEquals(195, c1.getSalud());
		assertEquals(0, a1.getSalud());
	}	
	
	@Test
	public void CaballeroVsLanceroTest() {
		
		Caballero c1 = new Caballero(new Punto(1,1), new Caballo());
		Lancero l1 = new Lancero(new Punto(1,2));
		
		c1.atacar(l1);
		l1.atacar(c1);
		
		assertEquals(175, c1.getSalud());
		assertEquals(100, l1.getSalud());
	}	
	
	
	@Test
	public void CaballeroConCaballoRebeldeTest() {
		
		Caballero c1 = new Caballero(new Punto(1,1), new Caballo());
		Caballero c2 = new Caballero(new Punto(1,1), new Caballo());
		
		c1.atacar(c2);
		c1.atacar(c2);
		c1.atacar(c2);
		
		
		assertEquals(50, c2.getSalud());
		assertFalse(c1.puedeAtacar(c2));
		assertEquals(200, c1.getSalud());
	}
		
}