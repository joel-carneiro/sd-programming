import discord
from discord.ext import commands

bot = commands.Bot(command_prefix="!")

@bot.event
async def on_ready():
    print("Estou pronto!")

bot.run("MTA1NDE0NDUxNjMxNzI3MDA2Ng.G2WsG4.5aAsBBk4ECXfjezypjEDbYCAx2Dxgls7riZl5c")

