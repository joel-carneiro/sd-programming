import pygame

# CONSTANTES
YELLOW = (255, 255, 0)
BLACK = (0, 0, 0)

VELOCITY = 0.5
R = 50
# DESENVOLVIMENTO DO JOGO
pygame.init()

window = pygame.display.set_mode(size=(640, 480))

x = 10
y = 10
vel_x = VELOCITY
vel_y = VELOCITY
while True:
    # PARTE I

    x = x + vel_x
    y = y + vel_y

    if x + R > 640:
        vel_x = -VELOCITY * 2
    if x - R < 0:
        vel_x = VELOCITY
    if y + R > 480:
        vel_y = -VELOCITY * 2
    if y - R < 0:
        vel_y = VELOCITY

    # PARTE
    window.fill(BLACK)
    pygame.draw.circle(window, YELLOW, (x, y), R, 0)
    pygame.display.update()

    # PARTE III

    for e in pygame.event.get():
        if e.type == pygame.QUIT:
            exit()
