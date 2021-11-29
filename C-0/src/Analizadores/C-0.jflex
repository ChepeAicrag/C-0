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

"(" 			{ return Token(sym.PARENTIZQ); }
")" 			{ return Token(sym.PARENDER); }
";"  			{ return Token(sym.PUNTOCOMA); }
"+" 			{ return Token(sym.SUMA); }
"-" 			{ return Token(sym.RESTA); }
"*" 			{ return Token(sym.PRODUCTO); }
"/" 			{ return Token(sym.DIVISION); }
"<" 			{ return Token(sym.MENOR); }
">" 			{ return Token(sym.MAYOR); }
"==" 			{ return Token(sym.IGUAL); }
"!=" 	 		{ return Token(sym.DISTINTO); }  
"||" 			{ return Token(sym.OR); }
"&&" 			{ return Token(sym.AND); }
"=" 			{ return Token(sym.ASIGNAR); }
"{" 			{ return Token(sym.LLAVEIZQ); }
"}" 			{ return Token(sym.LLAVEDER); }
"int"			{ return Token(sym.INT); }
"main" 			{ return Token(sym.MAIN); }
"if"			{ return Token(sym.IF); }
"else" 			{ return Token(sym.ELSE); }
"while"                 { return Token(sym.WHILE); }
"puts" 			{ return Token(sym.PUTS); }
"putw"			{ return Token(sym.PUTW); }
"break"			{ return Token(sym.BREAK); }
{CadenaTexto}   	{ return Token(sym.CADENATEXTO, yytext()); }
{Identificador}         { return Token(sym.ID, yytext()); }
{Digito}+		{ return Token(sym.ENTERO, yytext()); }
(" "|\n|\t|\r)+		{ /* ignore white space. */ }

. { System.err.println("Caracter no permitido: "+yytext()); }