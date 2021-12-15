package Analizadores;
import java_cup.runtime.Symbol;  
import java.lang.System;
import java.io.*;

%%
%unicode
%line
%cup
%char

%eofval{
	{ return Token(sym.EOF); }
%eofval}

%{
	String tok = "";

	private Symbol Token(int token, Object lexema) throws IOException {
		int linea = yyline + 1;
		tok = (String)lexema;
		if (token != sym.EOF)
			InformacionCodigo.guardarInformacionCodigo(linea, tok);
		return new Symbol(token, lexema);
	}

	private Symbol Token(int token) throws IOException {
		return Token(token, yytext());
	}

%}

Digito = [0-9]
Letra = [A-Za-z_]
CadenaTexto = \"([\x20-\x21\x23-\xFE])*\"
Alfanumerico = ({Letra}|{Digito})
Identificador = ({Letra})({Alfanumerico})*

%%

"(" 			{ System.out.println("Reconocido: <<"+yytext()+ ">>"); return Token(sym.PARENTIZQ); }
")" 			{ System.out.println("Reconocido: <<"+yytext()+">>"); return Token(sym.PARENDER); }
";"  			{ System.out.println("Reconocido: <<"+yytext()+">>"); return Token(sym.PUNTOCOMA); }
"+" 			{ System.out.println("Reconocido: <<"+yytext()+">>"); return Token(sym.SUMA); }
"-" 			{ System.out.println("Reconocido: <<"+yytext()+">>"); return Token(sym.RESTA); }
"*" 			{ System.out.println("Reconocido: <<"+yytext()+">>"); return Token(sym.PRODUCTO); }
"/" 			{ System.out.println("Reconocido: <<"+yytext()+">>"); return Token(sym.DIVISION); }
"<" 			{ System.out.println("Reconocido: <<"+yytext()+">>"); return Token(sym.MENOR); }
">" 			{ System.out.println("Reconocido: <<"+yytext()+">>"); return Token(sym.MAYOR); }
"==" 			{ System.out.println("Reconocido: <<"+yytext()+">>"); return Token(sym.IGUAL); }
"!=" 	 		{ System.out.println("Reconocido: <<"+yytext()+">>"); return Token(sym.DISTINTO); }  
"||" 			{ System.out.println("Reconocido: <<"+yytext()+">>"); return Token(sym.OR); }
"&&" 			{ System.out.println("Reconocido: <<"+yytext()+">>"); return Token(sym.AND); }
"=" 			{ System.out.println("Reconocido: <<"+yytext()+">>"); return Token(sym.ASIGNAR); }
"{" 			{ System.out.println("Reconocido: <<"+yytext()+">>"); return Token(sym.LLAVEIZQ); }
"}" 			{ System.out.println("Reconocido: <<"+yytext()+">>"); return Token(sym.LLAVEDER); }
"int"			{ System.out.println("Reconocido: <<"+yytext()+">>"); return Token(sym.INT); }
"main" 			{ System.out.println("Reconocido: <<"+yytext()+">>"); return Token(sym.MAIN); }
"if"			{ System.out.println("Reconocido: <<"+yytext()+">>"); return Token(sym.IF); }
"else" 			{ System.out.println("Reconocido: <<"+yytext()+">>"); return Token(sym.ELSE); }
"while"                 { System.out.println("Reconocido: <<"+yytext()+">>"); return Token(sym.WHILE); }
"puts" 			{ System.out.println("Reconocido: <<"+yytext()+">>"); return Token(sym.PUTS); }
"putw"			{ System.out.println("Reconocido: <<"+yytext()+">>"); return Token(sym.PUTW); }
"break"			{ System.out.println("Reconocido: <<"+yytext()+">>"); return Token(sym.BREAK); }
{CadenaTexto}   	{ System.out.println("Reconocido: <<"+yytext()+">>"); return Token(sym.CADENATEXTO, yytext()); }
{Identificador}         { System.out.println("Reconocido: <<"+yytext()+">>"); return Token(sym.ID, yytext()); }
{Digito}+		{ System.out.println("Reconocido: <<"+yytext()+">>"); return Token(sym.ENTERO, yytext()); }
(" "|\n|\t|\r)+		{ /* ignore white space. */ }

. { System.err.println("Caracter no permitido: "+yytext()); }