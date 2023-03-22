f = open('mi_primer_archivo.txt', 'w')
f.write('Mi primera linea de texto.\n')
f.close

f = open('mi_primer_archivo.txt', 'r+')
f.readline()
f.write('Mi segunda linea de texto.\n')

f.seek(0)
print(f.read())
f.close()